package com.google.android.gms.vision.barcode;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.internal.client.zzd;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;

public final class BarcodeDetector
  extends Detector
{
  private final zzd zzbnu;
  
  private BarcodeDetector()
  {
    throw new IllegalStateException("Default constructor called");
  }
  
  private BarcodeDetector(zzd paramzzd)
  {
    zzbnu = paramzzd;
  }
  
  public final SparseArray detect(Frame paramFrame)
  {
    if (paramFrame == null) {
      throw new IllegalArgumentException("No frame supplied.");
    }
    paramFrame.getMetadata();
    Object localObject1 = FrameMetadataParcel.zzc(paramFrame);
    if (paramFrame.getBitmap() != null) {}
    for (paramFrame = zzbnu.zza(paramFrame.getBitmap(), (FrameMetadataParcel)localObject1);; paramFrame = zzbnu.zza(paramFrame, (FrameMetadataParcel)localObject1))
    {
      localObject1 = new SparseArray(paramFrame.length);
      int j = paramFrame.length;
      int i = 0;
      while (i < j)
      {
        Object localObject2 = paramFrame[i];
        ((SparseArray)localObject1).append(rawValue.hashCode(), localObject2);
        i += 1;
      }
      paramFrame = paramFrame.getGrayscaleImageData();
    }
    return (SparseArray)localObject1;
  }
  
  public final boolean isOperational()
  {
    return zzbnu.isOperational();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.BarcodeDetector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */