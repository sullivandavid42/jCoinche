package Network;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by skytw on 27/11/2016.
 */
public class ClientHandler extends ChannelInboundHandlerAdapter implements ChannelHandler {
    @Override
    //recois un message du serveur
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf in = (ByteBuf) msg;
        String message = in.toString(CharsetUtil.UTF_8);
        //si on recoit plusieur messages en meme temps on les séparent
        ArrayList<String> tabmsg = new ArrayList<String>(Arrays.asList(message.split("\n")));
        if (tabmsg.contains("Server Full\r\n"))
        {
            System.out.println("Server is full");
        }

        System.out.println(message);
    }

    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
        System.out.println("Connected to server");
    }

    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {

    }
}
