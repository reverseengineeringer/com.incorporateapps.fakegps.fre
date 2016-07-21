package com.google.android.gms.vision.barcode.internal.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

public class zzd
{
  private final Context mContext;
  private final BarcodeDetectorOptions zzbnv;
  private zzb zzbnx = null;
  private final Object zzpV = new Object();
  
  public zzd(Context paramContext, BarcodeDetectorOptions paramBarcodeDetectorOptions)
  {
    mContext = paramContext;
    zzbnv = paramBarcodeDetectorOptions;
    zzIg();
  }
  
  private zzb zzIg()
  {
    synchronized (zzpV)
    {
      if (zzbnx == null) {
        zzbnx = zzd.zza.zza(mContext, zzbnv);
      }
      zzb localzzb = zzbnx;
      return localzzb;
    }
  }
  
  public boolean isOperational()
  {
    return zzIg() != null;
  }
  
  public Barcode[] zza(Bitmap paramBitmap, FrameMetadataParcel paramFrameMetadataParcel)
  {
    zzb localzzb = zzIg();
    if (localzzb == null) {
      return new Barcode[0];
    }
    try
    {
      paramBitmap = localzzb.zzb(zze.zzC(paramBitmap), paramFrameMetadataParcel);
      return paramBitmap;
    }
    catch (RemoteException paramBitmap)
    {
      Log.e("NativeBarcodeDetectorHandle", "Error calling native barcode detector", paramBitmap);
    }
    return new Barcode[0];
  }
  
  public Barcode[] zza(ByteBuffer paramByteBuffer, FrameMetadataParcel paramFrameMetadataParcel)
  {
    zzb localzzb = zzIg();
    if (localzzb == null) {
      return new Barcode[0];
    }
    try
    {
      paramByteBuffer = localzzb.zza(zze.zzC(paramByteBuffer), paramFrameMetadataParcel);
      return paramByteBuffer;
    }
    catch (RemoteException paramByteBuffer)
    {
      Log.e("NativeBarcodeDetectorHandle", "Error calling native barcode detector", paramByteBuffer);
    }
    return new Barcode[0];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.internal.client.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */