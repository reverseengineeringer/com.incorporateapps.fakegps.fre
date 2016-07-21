package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzag.zza;
import com.google.android.gms.internal.zzrs;
import com.google.android.gms.internal.zzrs.zzc;
import com.google.android.gms.internal.zzrs.zzg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Container
{
  private final Context mContext;
  private final String zzbhM;
  private final DataLayer zzbhN;
  private zzcp zzbhO;
  private Map zzbhP = new HashMap();
  private Map zzbhQ = new HashMap();
  private volatile long zzbhR;
  private volatile String zzbhS = "";
  
  Container(Context paramContext, DataLayer paramDataLayer, String paramString, long paramLong, zzaf.zzj paramzzj)
  {
    mContext = paramContext;
    zzbhN = paramDataLayer;
    zzbhM = paramString;
    zzbhR = paramLong;
    zza(zzju);
    if (zzjt != null) {
      zza(zzjt);
    }
  }
  
  Container(Context paramContext, DataLayer paramDataLayer, String paramString, long paramLong, zzrs.zzc paramzzc)
  {
    mContext = paramContext;
    zzbhN = paramDataLayer;
    zzbhM = paramString;
    zzbhR = paramLong;
    zza(paramzzc);
  }
  
  private zzcp zzGc()
  {
    try
    {
      zzcp localzzcp = zzbhO;
      return localzzcp;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void zza(zzaf.zzf paramzzf)
  {
    if (paramzzf == null) {
      throw new NullPointerException();
    }
    try
    {
      zzrs.zzc localzzc = zzrs.zzb(paramzzf);
      zza(localzzc);
      return;
    }
    catch (zzrs.zzg localzzg)
    {
      zzbg.e("Not loading resource: " + paramzzf + " because it is invalid: " + localzzg.toString());
    }
  }
  
  private void zza(zzrs.zzc paramzzc)
  {
    zzbhS = paramzzc.getVersion();
    zzah localzzah = zzfS(zzbhS);
    zza(new zzcp(mContext, paramzzc, zzbhN, new Container.zza(this, null), new Container.zzb(this, null), localzzah));
    if (getBoolean("_gtm.loadEventEnabled")) {
      zzbhN.pushEvent("gtm.load", DataLayer.mapOf(new Object[] { "gtm.id", zzbhM }));
    }
  }
  
  private void zza(zzcp paramzzcp)
  {
    try
    {
      zzbhO = paramzzcp;
      return;
    }
    finally
    {
      paramzzcp = finally;
      throw paramzzcp;
    }
  }
  
  private void zza(zzaf.zzi[] paramArrayOfzzi)
  {
    ArrayList localArrayList = new ArrayList();
    int j = paramArrayOfzzi.length;
    int i = 0;
    while (i < j)
    {
      localArrayList.add(paramArrayOfzzi[i]);
      i += 1;
    }
    zzGc().zzF(localArrayList);
  }
  
  public boolean getBoolean(String paramString)
  {
    zzcp localzzcp = zzGc();
    if (localzzcp == null)
    {
      zzbg.e("getBoolean called for closed container.");
      return zzdf.zzHC().booleanValue();
    }
    try
    {
      boolean bool = zzdf.zzk((zzag.zza)localzzcp.zzgn(paramString).getObject()).booleanValue();
      return bool;
    }
    catch (Exception paramString)
    {
      zzbg.e("Calling getBoolean() threw an exception: " + paramString.getMessage() + " Returning default value.");
    }
    return zzdf.zzHC().booleanValue();
  }
  
  public String getContainerId()
  {
    return zzbhM;
  }
  
  public double getDouble(String paramString)
  {
    zzcp localzzcp = zzGc();
    if (localzzcp == null)
    {
      zzbg.e("getDouble called for closed container.");
      return zzdf.zzHB().doubleValue();
    }
    try
    {
      double d = zzdf.zzj((zzag.zza)localzzcp.zzgn(paramString).getObject()).doubleValue();
      return d;
    }
    catch (Exception paramString)
    {
      zzbg.e("Calling getDouble() threw an exception: " + paramString.getMessage() + " Returning default value.");
    }
    return zzdf.zzHB().doubleValue();
  }
  
  public long getLastRefreshTime()
  {
    return zzbhR;
  }
  
  public long getLong(String paramString)
  {
    zzcp localzzcp = zzGc();
    if (localzzcp == null)
    {
      zzbg.e("getLong called for closed container.");
      return zzdf.zzHA().longValue();
    }
    try
    {
      long l = zzdf.zzi((zzag.zza)localzzcp.zzgn(paramString).getObject()).longValue();
      return l;
    }
    catch (Exception paramString)
    {
      zzbg.e("Calling getLong() threw an exception: " + paramString.getMessage() + " Returning default value.");
    }
    return zzdf.zzHA().longValue();
  }
  
  public String getString(String paramString)
  {
    zzcp localzzcp = zzGc();
    if (localzzcp == null)
    {
      zzbg.e("getString called for closed container.");
      return zzdf.zzHE();
    }
    try
    {
      paramString = zzdf.zzg((zzag.zza)localzzcp.zzgn(paramString).getObject());
      return paramString;
    }
    catch (Exception paramString)
    {
      zzbg.e("Calling getString() threw an exception: " + paramString.getMessage() + " Returning default value.");
    }
    return zzdf.zzHE();
  }
  
  public boolean isDefault()
  {
    return getLastRefreshTime() == 0L;
  }
  
  public void registerFunctionCallMacroCallback(String paramString, Container.FunctionCallMacroCallback paramFunctionCallMacroCallback)
  {
    if (paramFunctionCallMacroCallback == null) {
      throw new NullPointerException("Macro handler must be non-null");
    }
    synchronized (zzbhP)
    {
      zzbhP.put(paramString, paramFunctionCallMacroCallback);
      return;
    }
  }
  
  public void registerFunctionCallTagCallback(String paramString, Container.FunctionCallTagCallback paramFunctionCallTagCallback)
  {
    if (paramFunctionCallTagCallback == null) {
      throw new NullPointerException("Tag callback must be non-null");
    }
    synchronized (zzbhQ)
    {
      zzbhQ.put(paramString, paramFunctionCallTagCallback);
      return;
    }
  }
  
  void release()
  {
    zzbhO = null;
  }
  
  public void unregisterFunctionCallMacroCallback(String paramString)
  {
    synchronized (zzbhP)
    {
      zzbhP.remove(paramString);
      return;
    }
  }
  
  public void unregisterFunctionCallTagCallback(String paramString)
  {
    synchronized (zzbhQ)
    {
      zzbhQ.remove(paramString);
      return;
    }
  }
  
  public String zzGb()
  {
    return zzbhS;
  }
  
  Container.FunctionCallMacroCallback zzfP(String paramString)
  {
    synchronized (zzbhP)
    {
      paramString = (Container.FunctionCallMacroCallback)zzbhP.get(paramString);
      return paramString;
    }
  }
  
  public Container.FunctionCallTagCallback zzfQ(String paramString)
  {
    synchronized (zzbhQ)
    {
      paramString = (Container.FunctionCallTagCallback)zzbhQ.get(paramString);
      return paramString;
    }
  }
  
  public void zzfR(String paramString)
  {
    zzGc().zzfR(paramString);
  }
  
  zzah zzfS(String paramString)
  {
    zzcb.zzGU().zzGV().equals(zzcb.zza.zzbjW);
    return new zzbo();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.Container
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */