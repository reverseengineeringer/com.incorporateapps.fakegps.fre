package com.google.android.gms.vision;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class Frame$Builder
{
  private Frame zzbnk = new Frame(null);
  
  public Frame build()
  {
    if ((Frame.zza(zzbnk) == null) && (Frame.zzb(zzbnk) == null)) {
      throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
    }
    return zzbnk;
  }
  
  public Builder setBitmap(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Frame.zza(zzbnk, paramBitmap);
    paramBitmap = zzbnk.getMetadata();
    Frame.Metadata.zza(paramBitmap, i);
    Frame.Metadata.zzb(paramBitmap, j);
    return this;
  }
  
  public Builder setId(int paramInt)
  {
    Frame.Metadata.zzc(zzbnk.getMetadata(), paramInt);
    return this;
  }
  
  public Builder setImageData(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramByteBuffer == null) {
      throw new IllegalArgumentException("Null image data supplied.");
    }
    if (paramByteBuffer.capacity() < paramInt1 * paramInt2) {
      throw new IllegalArgumentException("Invalid image data size.");
    }
    switch (paramInt3)
    {
    default: 
      throw new IllegalArgumentException("Unsupported image format: " + paramInt3);
    }
    Frame.zza(zzbnk, paramByteBuffer);
    paramByteBuffer = zzbnk.getMetadata();
    Frame.Metadata.zza(paramByteBuffer, paramInt1);
    Frame.Metadata.zzb(paramByteBuffer, paramInt2);
    return this;
  }
  
  public Builder setRotation(int paramInt)
  {
    Frame.Metadata.zzd(zzbnk.getMetadata(), paramInt);
    return this;
  }
  
  public Builder setTimestampMillis(long paramLong)
  {
    Frame.Metadata.zza(zzbnk.getMetadata(), paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.Frame.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */