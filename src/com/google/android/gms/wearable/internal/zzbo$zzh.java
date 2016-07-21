package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;

final class zzbo$zzh
  extends zzbo.zzb
{
  private final zzt zzbtd;
  
  public zzbo$zzh(zza.zzb paramzzb, zzt paramzzt)
  {
    super(paramzzb);
    zzbtd = ((zzt)zzx.zzz(paramzzt));
  }
  
  public final void zza(GetChannelInputStreamResponse paramGetChannelInputStreamResponse)
  {
    zzp localzzp = null;
    if (zzbsC != null)
    {
      localzzp = new zzp(new ParcelFileDescriptor.AutoCloseInputStream(zzbsC));
      zzbtd.zza(localzzp.zzIJ());
    }
    zzX(new ChannelImpl.zza(new Status(statusCode), localzzp));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbo.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */