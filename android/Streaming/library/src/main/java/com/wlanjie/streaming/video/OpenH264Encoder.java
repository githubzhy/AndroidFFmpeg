package com.wlanjie.streaming.video;

/**
 * Created by wlanjie on 2017/6/25.
 */
public class OpenH264Encoder {

  public native static boolean openEncoder();
  public native static void closeEncoder();
  public native static void setFrameSize(int width, int height);
  public native static void encode(byte[] data, int width, int height, long pts);
}
