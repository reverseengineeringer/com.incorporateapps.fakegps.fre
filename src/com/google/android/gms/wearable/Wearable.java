package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.wearable.internal.zzaz;
import com.google.android.gms.wearable.internal.zzbb;
import com.google.android.gms.wearable.internal.zzbm;
import com.google.android.gms.wearable.internal.zzbr;
import com.google.android.gms.wearable.internal.zze;
import com.google.android.gms.wearable.internal.zzg;
import com.google.android.gms.wearable.internal.zzj;
import com.google.android.gms.wearable.internal.zzl;
import com.google.android.gms.wearable.internal.zzw;
import com.google.android.gms.wearable.internal.zzx;

public class Wearable
{
  public static final Api API = new Api("Wearable.API", zzUJ, zzUI);
  public static final CapabilityApi CapabilityApi;
  public static final ChannelApi ChannelApi;
  public static final DataApi DataApi = new zzx();
  public static final MessageApi MessageApi;
  public static final NodeApi NodeApi;
  public static final Api.zzc zzUI;
  private static final Api.zza zzUJ;
  public static final zzc zzbrj;
  public static final zza zzbrk;
  public static final zzf zzbrl;
  public static final zzi zzbrm;
  public static final zzk zzbrn;
  
  static
  {
    CapabilityApi = new zzj();
    MessageApi = new zzaz();
    NodeApi = new zzbb();
    ChannelApi = new zzl();
    zzbrj = new zzg();
    zzbrk = new zze();
    zzbrl = new zzw();
    zzbrm = new zzbm();
    zzbrn = new zzbr();
    zzUI = new Api.zzc();
    zzUJ = new Wearable.1();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.Wearable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */