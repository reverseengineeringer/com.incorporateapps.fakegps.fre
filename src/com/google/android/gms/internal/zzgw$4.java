package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zza;
import java.util.List;

class zzgw$4
  implements zzjf.zza
{
  zzgw$4(zzgw paramzzgw, String paramString, Integer paramInteger1, Integer paramInteger2, int paramInt1, int paramInt2, int paramInt3) {}
  
  public zza zzh(List paramList)
  {
    if (paramList != null) {
      for (;;)
      {
        try
        {
          if (paramList.isEmpty()) {
            break;
          }
          String str = zzGT;
          List localList = zzgw.zzg(paramList);
          Integer localInteger1 = zzGU;
          Integer localInteger2 = zzGV;
          if (zzGW > 0)
          {
            paramList = Integer.valueOf(zzGW);
            paramList = new zza(str, localList, localInteger1, localInteger2, paramList, zzGX + zzGY);
            return paramList;
          }
        }
        catch (RemoteException paramList)
        {
          zzin.zzb("Could not get attribution icon", paramList);
          return null;
        }
        paramList = null;
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgw.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */