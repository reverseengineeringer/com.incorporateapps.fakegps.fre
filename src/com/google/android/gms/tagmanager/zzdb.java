package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class zzdb
  extends zzak
{
  private static final String ID = zzad.zzdl.toString();
  private static final String NAME = zzae.zzgo.toString();
  private static final String zzblp = zzae.zzfT.toString();
  private static final String zzblq = zzae.zzgb.toString();
  private static final String zzblr = zzae.zzhW.toString();
  private final Context mContext;
  private Handler mHandler;
  private DataLayer zzbhN;
  private boolean zzbls;
  private boolean zzblt;
  private final HandlerThread zzblu;
  private final Set zzblv = new HashSet();
  
  public zzdb(Context paramContext, DataLayer paramDataLayer)
  {
    super(ID, new String[] { zzblp, NAME });
    mContext = paramContext;
    zzbhN = paramDataLayer;
    zzblu = new HandlerThread("Google GTM SDK Timer", 10);
    zzblu.start();
    mHandler = new Handler(zzblu.getLooper());
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    String str2 = zzdf.zzg((zzag.zza)paramMap.get(NAME));
    String str1 = zzdf.zzg((zzag.zza)paramMap.get(zzblr));
    String str3 = zzdf.zzg((zzag.zza)paramMap.get(zzblp));
    paramMap = zzdf.zzg((zzag.zza)paramMap.get(zzblq));
    try
    {
      l1 = Long.parseLong(str3);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      try
      {
        for (;;)
        {
          l2 = Long.parseLong(paramMap);
          if ((l1 > 0L) && (!TextUtils.isEmpty(str2)))
          {
            if (str1 != null)
            {
              paramMap = str1;
              if (!str1.isEmpty()) {}
            }
            else
            {
              paramMap = "0";
            }
            if (!zzblv.contains(paramMap))
            {
              if (!"0".equals(paramMap)) {
                zzblv.add(paramMap);
              }
              mHandler.postDelayed(new zzdb.zza(this, str2, paramMap, l1, l2), l1);
            }
          }
          return zzdf.zzHF();
          localNumberFormatException = localNumberFormatException;
          long l1 = 0L;
        }
      }
      catch (NumberFormatException paramMap)
      {
        for (;;)
        {
          long l2 = 0L;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzdb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */