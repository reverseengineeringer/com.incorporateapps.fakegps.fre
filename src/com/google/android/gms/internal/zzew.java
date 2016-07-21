package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.i;
import com.google.ads.mediation.q;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

public final class zzew
  extends zzex.zza
{
  private Map zzCG;
  
  private zzey zzah(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString, false, zzew.class.getClassLoader());
      if (i.class.isAssignableFrom((Class)localObject))
      {
        localObject = (i)((Class)localObject).newInstance();
        return new zzfj((i)localObject, (q)zzCG.get(((i)localObject).b()));
      }
      if (MediationAdapter.class.isAssignableFrom((Class)localObject)) {
        return new zzfe((MediationAdapter)((Class)localObject).newInstance());
      }
      zzb.zzaK("Could not instantiate mediation adapter: " + paramString + " (not a valid adapter).");
      throw new RemoteException();
    }
    catch (Throwable localThrowable) {}
    return zzai(paramString);
  }
  
  private zzey zzai(String paramString)
  {
    do
    {
      try
      {
        zzb.zzaI("Reflection failed, retrying using direct instantiation");
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString)) {
          return new zzfe(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(paramString))
        {
          zzfe localzzfe = new zzfe(new AdUrlAdapter());
          return localzzfe;
        }
      }
      catch (Throwable localThrowable)
      {
        zzb.zzd("Could not instantiate mediation adapter: " + paramString + ". ", localThrowable);
        throw new RemoteException();
      }
      if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString)) {
        return new zzfe(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
      }
    } while (!"com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString));
    Object localObject = new com.google.ads.mediation.customevent.CustomEventAdapter();
    localObject = new zzfj((i)localObject, (CustomEventExtras)zzCG.get(((com.google.ads.mediation.customevent.CustomEventAdapter)localObject).b()));
    return (zzey)localObject;
  }
  
  public final zzey zzaf(String paramString)
  {
    return zzah(paramString);
  }
  
  public final boolean zzag(String paramString)
  {
    try
    {
      boolean bool = CustomEvent.class.isAssignableFrom(Class.forName(paramString, false, zzew.class.getClassLoader()));
      return bool;
    }
    catch (Throwable localThrowable)
    {
      zzb.zzaK("Could not load custom event implementation class: " + paramString + ", assuming old implementation.");
    }
    return false;
  }
  
  public final void zzg(Map paramMap)
  {
    zzCG = paramMap;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzew
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */