package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.zzh.zza;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public class zzif
{
  public final int errorCode;
  public final int orientation;
  public final List zzBQ;
  public final List zzBR;
  public final long zzBU;
  public final zzen zzCp;
  public final zzey zzCq;
  public final String zzCr;
  public final zzeq zzCs;
  public final zzjp zzED;
  public final long zzHS;
  public final boolean zzHT;
  public final long zzHU;
  public final List zzHV;
  public final String zzHY;
  public final AdRequestParcel zzHt;
  public final String zzHw;
  public final RewardItemParcel zzIj;
  public final List zzIl;
  public final boolean zzIm;
  public final JSONObject zzKT;
  public boolean zzKU;
  public final zzeo zzKV;
  public final AdSizeParcel zzKW;
  public final List zzKX;
  public final long zzKY;
  public final long zzKZ;
  public final zzh.zza zzLa;
  public boolean zzLb = false;
  public boolean zzLc = false;
  
  public zzif(AdRequestParcel paramAdRequestParcel, zzjp paramzzjp, List paramList1, int paramInt1, List paramList2, List paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean1, zzen paramzzen, zzey paramzzey, String paramString2, zzeo paramzzeo, zzeq paramzzeq, long paramLong2, AdSizeParcel paramAdSizeParcel, long paramLong3, long paramLong4, long paramLong5, String paramString3, JSONObject paramJSONObject, zzh.zza paramzza, RewardItemParcel paramRewardItemParcel, List paramList4, List paramList5, boolean paramBoolean2)
  {
    zzHt = paramAdRequestParcel;
    zzED = paramzzjp;
    zzBQ = zzj(paramList1);
    errorCode = paramInt1;
    zzBR = zzj(paramList2);
    zzHV = zzj(paramList3);
    orientation = paramInt2;
    zzBU = paramLong1;
    zzHw = paramString1;
    zzHT = paramBoolean1;
    zzCp = paramzzen;
    zzCq = paramzzey;
    zzCr = paramString2;
    zzKV = paramzzeo;
    zzCs = paramzzeq;
    zzHU = paramLong2;
    zzKW = paramAdSizeParcel;
    zzHS = paramLong3;
    zzKY = paramLong4;
    zzKZ = paramLong5;
    zzHY = paramString3;
    zzKT = paramJSONObject;
    zzLa = paramzza;
    zzIj = paramRewardItemParcel;
    zzKX = zzj(paramList4);
    zzIl = zzj(paramList5);
    zzIm = paramBoolean2;
  }
  
  public zzif(zzif.zza paramzza, zzjp paramzzjp, zzen paramzzen, zzey paramzzey, String paramString, zzeq paramzzeq, zzh.zza paramzza1)
  {
    this(zzLd.zzHt, paramzzjp, zzLe.zzBQ, errorCode, zzLe.zzBR, zzLe.zzHV, zzLe.orientation, zzLe.zzBU, zzLd.zzHw, zzLe.zzHT, paramzzen, paramzzey, paramString, zzKV, paramzzeq, zzLe.zzHU, zzrp, zzLe.zzHS, zzKY, zzKZ, zzLe.zzHY, zzKT, paramzza1, zzLe.zzIj, zzLe.zzIk, zzLe.zzIk, zzLe.zzIm);
  }
  
  private static List zzj(List paramList)
  {
    if (paramList == null) {
      return null;
    }
    return Collections.unmodifiableList(paramList);
  }
  
  public boolean zzcv()
  {
    if ((zzED == null) || (zzED.zzhU() == null)) {
      return false;
    }
    return zzED.zzhU().zzcv();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzif
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */