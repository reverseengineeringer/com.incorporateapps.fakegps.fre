package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.zze;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

public class zzih
  implements zzip.zzb
{
  private Context mContext;
  private boolean zzJA = true;
  private boolean zzJz = true;
  private final LinkedList zzLA = new LinkedList();
  private Boolean zzLB = null;
  private boolean zzLC = false;
  private boolean zzLD = false;
  private final String zzLq;
  private final zzii zzLr;
  private BigInteger zzLs = BigInteger.ONE;
  private final HashSet zzLt = new HashSet();
  private final HashMap zzLu = new HashMap();
  private boolean zzLv = false;
  private int zzLw = 0;
  private zzbv zzLx = null;
  private zzbf zzLy = null;
  private String zzLz;
  private VersionInfoParcel zzpT;
  private final Object zzpV = new Object();
  private zzax zzpl;
  private boolean zzqA = false;
  private zzbe zzsZ = null;
  private zzbd zzta = null;
  private final zzha zztb = null;
  private String zzzN;
  
  public zzih(zzir paramzzir)
  {
    zzLq = paramzzir.zzhs();
    zzLr = new zzii(zzLq);
  }
  
  public String getSessionId()
  {
    return zzLq;
  }
  
  public void zzB(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      if (zzJA != paramBoolean) {
        zzip.zzb(mContext, paramBoolean);
      }
      zzJA = paramBoolean;
      zzbf localzzbf = zzG(mContext);
      if ((localzzbf != null) && (!localzzbf.isAlive()))
      {
        zzin.zzaJ("start fetching content...");
        localzzbf.zzcG();
      }
      return;
    }
  }
  
  public void zzC(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      zzLC = paramBoolean;
      return;
    }
  }
  
  public zzbf zzG(Context paramContext)
  {
    if ((!((Boolean)zzbt.zzwj.get()).booleanValue()) || (!zzne.zzsg()) || (zzgY())) {
      return null;
    }
    synchronized (zzpV)
    {
      if (zzsZ == null)
      {
        if (!(paramContext instanceof Activity)) {
          return null;
        }
        zzsZ = new zzbe((Application)paramContext.getApplicationContext(), (Activity)paramContext);
      }
      if (zzta == null) {
        zzta = new zzbd();
      }
      if (zzLy == null) {
        zzLy = new zzbf(zzsZ, zzta, new zzha(mContext, zzpT, null, null));
      }
      zzLy.zzcG();
      paramContext = zzLy;
      return paramContext;
    }
  }
  
  public Bundle zza(Context paramContext, zzij paramzzij, String paramString)
  {
    Bundle localBundle;
    synchronized (zzpV)
    {
      localBundle = new Bundle();
      localBundle.putBundle("app", zzLr.zzc(paramContext, paramString));
      paramContext = new Bundle();
      paramString = zzLu.keySet().iterator();
      if (paramString.hasNext())
      {
        String str = (String)paramString.next();
        paramContext.putBundle(str, ((zzik)zzLu.get(str)).toBundle());
      }
    }
    localBundle.putBundle("slots", paramContext);
    paramContext = new ArrayList();
    paramString = zzLt.iterator();
    while (paramString.hasNext()) {
      paramContext.add(((zzig)paramString.next()).toBundle());
    }
    localBundle.putParcelableArrayList("ads", paramContext);
    paramzzij.zza(zzLt);
    zzLt.clear();
    return localBundle;
  }
  
  public Future zza(Context paramContext, boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      if (paramBoolean != zzJz)
      {
        zzJz = paramBoolean;
        paramContext = zzip.zza(paramContext, paramBoolean);
        return paramContext;
      }
      return null;
    }
  }
  
  public void zza(zzig paramzzig)
  {
    synchronized (zzpV)
    {
      zzLt.add(paramzzig);
      return;
    }
  }
  
  public void zza(String paramString, zzik paramzzik)
  {
    synchronized (zzpV)
    {
      zzLu.put(paramString, paramzzik);
      return;
    }
  }
  
  public void zza(Thread paramThread)
  {
    zzha.zza(mContext, paramThread, zzpT);
  }
  
  public Future zzaA(String paramString)
  {
    Object localObject = zzpV;
    if (paramString != null) {}
    try
    {
      if (!paramString.equals(zzLz))
      {
        zzLz = paramString;
        paramString = zzip.zzd(mContext, paramString);
        return paramString;
      }
      return null;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void zzb(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    synchronized (zzpV)
    {
      if (!zzqA)
      {
        mContext = paramContext.getApplicationContext();
        zzpT = paramVersionInfoParcel;
        zzip.zza(paramContext, this);
        zzip.zzb(paramContext, this);
        zzip.zzc(paramContext, this);
        zzip.zzd(paramContext, this);
        zza(Thread.currentThread());
        zzzN = zzr.zzbC().zze(paramContext, afmaVersion);
        if ((zzne.zzsn()) && (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted())) {
          zzLD = true;
        }
        zzpl = new zzax(paramContext.getApplicationContext(), zzpT, new zzeg(paramContext.getApplicationContext(), zzpT, (String)zzbt.zzvB.get()));
        zzhk();
        zzr.zzbM().zzz(mContext);
        zzqA = true;
      }
      return;
    }
  }
  
  public void zzb(Boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      zzLB = paramBoolean;
      return;
    }
  }
  
  public void zzb(Throwable paramThrowable, boolean paramBoolean)
  {
    new zzha(mContext, zzpT, null, null).zza(paramThrowable, paramBoolean);
  }
  
  public void zzb(HashSet paramHashSet)
  {
    synchronized (zzpV)
    {
      zzLt.addAll(paramHashSet);
      return;
    }
  }
  
  public String zzd(int paramInt, String paramString)
  {
    if (zzpT.zzNb) {}
    for (Resources localResources = mContext.getResources(); localResources == null; localResources = zze.getRemoteResource(mContext)) {
      return paramString;
    }
    return localResources.getString(paramInt);
  }
  
  public void zze(Bundle paramBundle)
  {
    synchronized (zzpV)
    {
      if (paramBundle.containsKey("use_https")) {}
      for (boolean bool = paramBundle.getBoolean("use_https");; bool = zzJz)
      {
        zzJz = bool;
        if (!paramBundle.containsKey("webview_cache_version")) {
          break;
        }
        i = paramBundle.getInt("webview_cache_version");
        zzLw = i;
        if (paramBundle.containsKey("content_url_opted_out")) {
          zzB(paramBundle.getBoolean("content_url_opted_out"));
        }
        if (paramBundle.containsKey("content_url_hashes")) {
          zzLz = paramBundle.getString("content_url_hashes");
        }
        return;
      }
      int i = zzLw;
    }
  }
  
  public boolean zzgY()
  {
    synchronized (zzpV)
    {
      boolean bool = zzJA;
      return bool;
    }
  }
  
  public String zzgZ()
  {
    synchronized (zzpV)
    {
      String str = zzLs.toString();
      zzLs = zzLs.add(BigInteger.ONE);
      return str;
    }
  }
  
  public zzii zzha()
  {
    synchronized (zzpV)
    {
      zzii localzzii = zzLr;
      return localzzii;
    }
  }
  
  public zzbv zzhb()
  {
    synchronized (zzpV)
    {
      zzbv localzzbv = zzLx;
      return localzzbv;
    }
  }
  
  public boolean zzhc()
  {
    synchronized (zzpV)
    {
      boolean bool = zzLv;
      zzLv = true;
      return bool;
    }
  }
  
  public boolean zzhd()
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        if (!zzJz) {
          if (zzLD)
          {
            break label38;
            return bool;
          }
          else
          {
            bool = false;
          }
        }
      }
      label38:
      boolean bool = true;
    }
  }
  
  public String zzhe()
  {
    synchronized (zzpV)
    {
      String str = zzzN;
      return str;
    }
  }
  
  public String zzhf()
  {
    synchronized (zzpV)
    {
      String str = zzLz;
      return str;
    }
  }
  
  public Boolean zzhg()
  {
    synchronized (zzpV)
    {
      Boolean localBoolean = zzLB;
      return localBoolean;
    }
  }
  
  public zzax zzhh()
  {
    return zzpl;
  }
  
  public boolean zzhi()
  {
    synchronized (zzpV)
    {
      if (zzLw < ((Integer)zzbt.zzwA.get()).intValue())
      {
        zzLw = ((Integer)zzbt.zzwA.get()).intValue();
        zzip.zza(mContext, zzLw);
        return true;
      }
      return false;
    }
  }
  
  public boolean zzhj()
  {
    synchronized (zzpV)
    {
      boolean bool = zzLC;
      return bool;
    }
  }
  
  void zzhk()
  {
    zzbu localzzbu = new zzbu(mContext, zzpT.afmaVersion);
    try
    {
      zzLx = zzr.zzbH().zza(localzzbu);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      zzin.zzd("Cannot initialize CSI reporter.", localIllegalArgumentException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzih
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */