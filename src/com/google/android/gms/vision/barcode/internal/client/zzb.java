package com.google.android.gms.vision.barcode.internal.client;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;

public abstract interface zzb
  extends IInterface
{
  public abstract Barcode[] zza(zzd paramzzd, FrameMetadataParcel paramFrameMetadataParcel);
  
  public abstract Barcode[] zzb(zzd paramzzd, FrameMetadataParcel paramFrameMetadataParcel);
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.internal.client.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */