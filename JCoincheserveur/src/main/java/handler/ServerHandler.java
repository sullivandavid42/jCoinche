package handler;

import JCoincheServer.main;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.util.CharsetUtil;

/**
 * Created by skytw on 27/11/2016.
 */
public class ServerHandler extends ChannelInboundHandlerAdapter implements ChannelHandler {

    @Override
    //recois un message du client
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        System.out.println("Incoming msg");
        ByteBuf in = (ByteBuf) msg;
        System.out.println("Server receiveid: " + in.toString(CharsetUtil.UTF_8));
        //recois le message en fin de tour d'un client, et lance le tour du suivant
        if (in.toString(CharsetUtil.UTF_8).equals("Turn Over\r\n"))
        {
            main.turn= (main.turn + 1)%4;
            main.clients.get(main.turn).writeAndFlush(Unpooled.copiedBuffer("Your turn\r\n",CharsetUtil.UTF_8));
        }
    }
    //nouvelle connection
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
        if (main.clients.size() < 4) {
            main.clients.add(channelHandlerContext);
            channelHandlerContext.writeAndFlush(Unpooled.copiedBuffer("Success\r\n", CharsetUtil.UTF_8));
            channelHandlerContext.writeAndFlush(Unpooled.copiedBuffer("id:" + main.idcount++ + "\r\n", CharsetUtil.UTF_8));
        } else {
            channelHandlerContext.writeAndFlush(Unpooled.copiedBuffer("Server Full\r\n", CharsetUtil.UTF_8));
            channelHandlerContext.close();
        }
        System.out.println("New client");
        if (main.clients.size() == 4) {
            for (int i = 0; i < main.clients.size(); i++) {
                //lance la partie
                main.clients.get(i).writeAndFlush(Unpooled.copiedBuffer("Game Start\r\n", CharsetUtil.UTF_8));
                //afecte les team aux joueurs et les envoies
                if (i >= 2)
                    main.clients.get(i).writeAndFlush(Unpooled.copiedBuffer("Team:red\r\n", CharsetUtil.UTF_8));
                else
                    main.clients.get(i).writeAndFlush(Unpooled.copiedBuffer("Team:blue\r\n", CharsetUtil.UTF_8));
            }
            //lance le premier tour
            main.clients.get(main.turn).writeAndFlush(Unpooled.copiedBuffer("Your turn\r\n", CharsetUtil.UTF_8));
        }
    }
    //deconexion client
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {
        System.out.println("Client disconnected");
        main.clients.remove(channelHandlerContext);
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {

    }
}
