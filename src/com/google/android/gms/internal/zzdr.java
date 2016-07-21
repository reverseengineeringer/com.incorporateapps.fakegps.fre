package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class zzdr
  implements Releasable
{
  protected Context mContext;
  protected String zzzN;
  protected WeakReference zzzO;
  
  public zzdr(zzjp paramzzjp)
  {
    mContext = paramzzjp.getContext();
    zzzN = zzr.zzbC().zze(mContext, zzhXafmaVersion);
    zzzO = new WeakReference(paramzzjp);
  }
  
  private String zzW(String paramString)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return "internal";
        if (paramString.equals("error"))
        {
          i = 0;
          continue;
          if (paramString.equals("playerFailed"))
          {
            i = 1;
            continue;
            if (paramString.equals("inProgress"))
            {
              i = 2;
              continue;
              if (paramString.equals("contentLengthMissing"))
              {
                i = 3;
                continue;
                if (paramString.equals("noCacheDir"))
                {
                  i = 4;
                  continue;
                  if (paramString.equals("expireFailed"))
                  {
                    i = 5;
                    continue;
                    if (paramString.equals("badUrl"))
                    {
                      i = 6;
                      continue;
                      if (paramString.equals("downloadTimeout"))
                      {
                        i = 7;
                        continue;
                        if (paramString.equals("sizeExceeded"))
                        {
                          i = 8;
                          continue;
                          if (paramString.equals("externalAbort")) {
                            i = 9;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;
      }
    }
    return "internal";
    return "io";
    return "network";
    return "policy";
  }
  
  private void zza(String paramString, Map paramMap)
  {
    zzjp localzzjp = (zzjp)zzzO.get();
    if (localzzjp != null) {
      localzzjp.zza(paramString, paramMap);
    }
  }
  
  public abstract void abort();
  
  public void release() {}
  
  public abstract boolean zzU(String paramString);
  
  protected String zzV(String paramString)
  {
    return zzn.zzcS().zzaH(paramString);
  }
  
  protected void zza(String paramString1, String paramString2, int paramInt)
  {
    zza.zzMS.post(new zzdr.2(this, paramString1, paramString2, paramInt));
  }
  
  protected void zza(String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    zza.zzMS.post(new zzdr.1(this, paramString1, paramString2, paramInt1, paramInt2, paramBoolean));
  }
  
  protected void zza(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    zza.zzMS.post(new zzdr.3(this, paramString1, paramString2, paramString3, paramString4));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */