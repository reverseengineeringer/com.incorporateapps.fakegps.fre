package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

public class Frame
{
  public static final int ROTATION_0 = 0;
  public static final int ROTATION_180 = 2;
  public static final int ROTATION_270 = 3;
  public static final int ROTATION_90 = 1;
  private Bitmap mBitmap = null;
  private Frame.Metadata zzbni = new Frame.Metadata();
  private ByteBuffer zzbnj = null;
  
  private ByteBuffer zzIe()
  {
    int i = 0;
    int j = mBitmap.getWidth();
    int k = mBitmap.getHeight();
    int[] arrayOfInt = new int[j * k];
    mBitmap.getPixels(arrayOfInt, 0, j, 0, 0, j, k);
    byte[] arrayOfByte = new byte[j * k];
    while (i < arrayOfInt.length)
    {
      arrayOfByte[i] = ((byte)(int)(Color.red(arrayOfInt[i]) * 0.299F + Color.green(arrayOfInt[i]) * 0.587F + Color.blue(arrayOfInt[i]) * 0.114F));
      i += 1;
    }
    return ByteBuffer.wrap(arrayOfByte);
  }
  
  public Bitmap getBitmap()
  {
    return mBitmap;
  }
  
  public ByteBuffer getGrayscaleImageData()
  {
    if (mBitmap != null) {
      return zzIe();
    }
    return zzbnj;
  }
  
  public Frame.Metadata getMetadata()
  {
    return zzbni;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.Frame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */