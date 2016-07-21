package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.zzx;
import java.util.LinkedList;

class zzea
{
  private final LinkedList zzAB;
  private final int zzAC;
  private final String zzpS;
  private AdRequestParcel zzqH;
  
  zzea(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    zzx.zzz(paramAdRequestParcel);
    zzx.zzz(paramString);
    zzAB = new LinkedList();
    zzqH = paramAdRequestParcel;
    zzpS = paramString;
    zzAC = paramInt;
  }
  
  String getAdUnitId()
  {
    return zzpS;
  }
  
  int getNetworkType()
  {
    return zzAC;
  }
  
  int size()
  {
    return zzAB.size();
  }
  
  void zzb(zzdv paramzzdv)
  {
    paramzzdv = new zzea.zza(this, paramzzdv);
    zzAB.add(paramzzdv);
    paramzzdv.zzh(zzqH);
  }
  
  AdRequestParcel zzei()
  {
    return zzqH;
  }
  
  zzea.zza zzej()
  {
    return (zzea.zza)zzAB.remove();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzea
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */