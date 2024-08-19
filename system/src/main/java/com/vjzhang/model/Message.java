package com.vjzhang.model;

import java.io.IOException;
import java.nio.ByteBuffer;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class Message {
    private String from;
    private String to;
    private String content;

    // 构造函数、getter 和 setter


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static class MessageEncoder implements Encoder.Text<Message> {
        @Override
        public String encode(Message message) throws EncodeException {
            return message.getFrom() + "|" + message.getTo() + "|" + message.getContent();
        }

        @Override
        public void init(EndpointConfig config) {}

        @Override
        public void destroy() {}
    }

    public static class MessageDecoder implements Decoder.Text<Message> {
        @Override
        public Message decode(String message) throws DecodeException {
            String[] parts = message.split("\\|");
            if (parts.length != 3) {
                throw new DecodeException(message, "Invalid message format");
            }
            Message m = new Message();
            m.setFrom(parts[0]);
            m.setTo(parts[1]);
            m.setContent(parts[2]);
            return m;
        }

        @Override
        public boolean willDecode(String message) {
            return true;
        }

        @Override
        public void init(EndpointConfig config) {}

        @Override
        public void destroy() {}
    }
}
