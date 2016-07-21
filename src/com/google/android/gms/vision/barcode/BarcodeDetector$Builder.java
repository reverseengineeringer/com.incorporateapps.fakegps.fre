package com.google.android.gms.vision.barcode;

import android.content.Context;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.google.android.gms.vision.barcode.internal.client.zzd;

public class BarcodeDetector$Builder
{
  private Context mContext;
  private BarcodeDetectorOptions zzbnv;
  
  public BarcodeDetector$Builder(Context paramContext)
  {
    mContext = paramContext;
    zzbnv = new BarcodeDetectorOptions();
  }
  
  public BarcodeDetector build()
  {
    return new BarcodeDetector(new zzd(mContext, zzbnv), null);
  }
  
  public Builder setBarcodeFormats(int paramInt)
  {
    zzbnv.zzbnw = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.BarcodeDetector.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */