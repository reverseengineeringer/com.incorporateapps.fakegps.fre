package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

final class zzbq
  extends zzaw.zza
{
  private zzq zzbbb;
  private final IntentFilter[] zzbsT;
  private zzq zzbtp;
  private zzq zzbtq;
  private zzq zzbtr;
  private zzq zzbts;
  private zzq zzbtt;
  private zzq zzbtu;
  private zzq zzbtv;
  private final String zzbtw;
  
  private zzbq(IntentFilter[] paramArrayOfIntentFilter, String paramString)
  {
    zzbsT = ((IntentFilter[])zzx.zzz(paramArrayOfIntentFilter));
    zzbtw = paramString;
  }
  
  private static zzq.zzb zzI(List paramList)
  {
    return new zzbq.7(paramList);
  }
  
  public static zzbq zza(zzq paramzzq, String paramString, IntentFilter[] paramArrayOfIntentFilter)
  {
    paramString = new zzbq(paramArrayOfIntentFilter, (String)zzx.zzz(paramString));
    zzbtu = ((zzq)zzx.zzz(paramzzq));
    return paramString;
  }
  
  public static zzbq zza(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    paramArrayOfIntentFilter = new zzbq(paramArrayOfIntentFilter, null);
    zzbtr = ((zzq)zzx.zzz(paramzzq));
    return paramArrayOfIntentFilter;
  }
  
  private static zzq.zzb zzai(DataHolder paramDataHolder)
  {
    return new zzbq.3(paramDataHolder);
  }
  
  private static zzq.zzb zzb(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable)
  {
    return new zzbq.2(paramAmsEntityUpdateParcelable);
  }
  
  private static zzq.zzb zzb(AncsNotificationParcelable paramAncsNotificationParcelable)
  {
    return new zzbq.1(paramAncsNotificationParcelable);
  }
  
  private static zzq.zzb zzb(CapabilityInfoParcelable paramCapabilityInfoParcelable)
  {
    return new zzbq.9(paramCapabilityInfoParcelable);
  }
  
  private static zzq.zzb zzb(ChannelEventParcelable paramChannelEventParcelable)
  {
    return new zzbq.8(paramChannelEventParcelable);
  }
  
  private static zzq.zzb zzb(MessageEventParcelable paramMessageEventParcelable)
  {
    return new zzbq.4(paramMessageEventParcelable);
  }
  
  public static zzbq zzb(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    paramArrayOfIntentFilter = new zzbq(paramArrayOfIntentFilter, null);
    zzbbb = ((zzq)zzx.zzz(paramzzq));
    return paramArrayOfIntentFilter;
  }
  
  private static zzq.zzb zzc(NodeParcelable paramNodeParcelable)
  {
    return new zzbq.5(paramNodeParcelable);
  }
  
  public static zzbq zzc(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    paramArrayOfIntentFilter = new zzbq(paramArrayOfIntentFilter, null);
    zzbts = ((zzq)zzx.zzz(paramzzq));
    return paramArrayOfIntentFilter;
  }
  
  private static zzq.zzb zzd(NodeParcelable paramNodeParcelable)
  {
    return new zzbq.6(paramNodeParcelable);
  }
  
  public static zzbq zzd(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    paramArrayOfIntentFilter = new zzbq(paramArrayOfIntentFilter, null);
    zzbtu = ((zzq)zzx.zzz(paramzzq));
    return paramArrayOfIntentFilter;
  }
  
  public static zzbq zze(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    paramArrayOfIntentFilter = new zzbq(paramArrayOfIntentFilter, null);
    zzbtv = ((zzq)zzx.zzz(paramzzq));
    return paramArrayOfIntentFilter;
  }
  
  private static void zzh(zzq paramzzq)
  {
    if (paramzzq != null) {
      paramzzq.clear();
    }
  }
  
  public final void clear()
  {
    zzh(zzbtp);
    zzbtp = null;
    zzh(zzbtq);
    zzbtq = null;
    zzh(zzbtr);
    zzbtr = null;
    zzh(zzbbb);
    zzbbb = null;
    zzh(zzbts);
    zzbts = null;
    zzh(zzbtt);
    zzbtt = null;
    zzh(zzbtu);
    zzbtu = null;
    zzh(zzbtv);
    zzbtv = null;
  }
  
  public final void onConnectedNodes(List paramList)
  {
    if (zzbtt != null) {
      zzbtt.zza(zzI(paramList));
    }
  }
  
  public final IntentFilter[] zzIO()
  {
    return zzbsT;
  }
  
  public final String zzIP()
  {
    return zzbtw;
  }
  
  public final void zza(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable)
  {
    if (zzbtp != null) {
      zzbtp.zza(zzb(paramAmsEntityUpdateParcelable));
    }
  }
  
  public final void zza(AncsNotificationParcelable paramAncsNotificationParcelable)
  {
    if (zzbtq != null) {
      zzbtq.zza(zzb(paramAncsNotificationParcelable));
    }
  }
  
  public final void zza(CapabilityInfoParcelable paramCapabilityInfoParcelable)
  {
    if (zzbtv != null) {
      zzbtv.zza(zzb(paramCapabilityInfoParcelable));
    }
  }
  
  public final void zza(ChannelEventParcelable paramChannelEventParcelable)
  {
    if (zzbtu != null) {
      zzbtu.zza(zzb(paramChannelEventParcelable));
    }
  }
  
  public final void zza(MessageEventParcelable paramMessageEventParcelable)
  {
    if (zzbbb != null) {
      zzbbb.zza(zzb(paramMessageEventParcelable));
    }
  }
  
  public final void zza(NodeParcelable paramNodeParcelable)
  {
    if (zzbts != null) {
      zzbts.zza(zzc(paramNodeParcelable));
    }
  }
  
  public final void zzag(DataHolder paramDataHolder)
  {
    if (zzbtr != null)
    {
      zzbtr.zza(zzai(paramDataHolder));
      return;
    }
    paramDataHolder.close();
  }
  
  public final void zzb(NodeParcelable paramNodeParcelable)
  {
    if (zzbts != null) {
      zzbts.zza(zzd(paramNodeParcelable));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */