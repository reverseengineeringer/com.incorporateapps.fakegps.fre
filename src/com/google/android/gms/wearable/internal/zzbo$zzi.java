package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;

final class zzbo$zzi
  extends zzbo.zzb
{
  private final zzt zzbtd;
  
  public zzbo$zzi(zza.zzb paramzzb, zzt paramzzt)
  {
    super(paramzzb);
    zzbtd = ((zzt)zzx.zzz(paramzzt));
  }
  
  public final void zza(GetChannelOutputStreamResponse paramGetChannelOutputStreamResponse)
  {
    zzq localzzq = null;
    if (zzbsC != null)
    {
      localzzq = new zzq(new ParcelFileDescriptor.AutoCloseOutputStream(zzbsC));
      zzbtd.zza(localzzq.zzIJ());
    }
    zzX(new ChannelImpl.zzb(new Status(statusCode), localzzq));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbo.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */