package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zze;

public abstract class zzg
{
  private final String zzavI;
  private Object zzavJ;
  
  protected zzg(String paramString)
  {
    zzavI = paramString;
  }
  
  protected final Object zzaB(Context paramContext)
  {
    if (zzavJ == null)
    {
      zzx.zzz(paramContext);
      paramContext = zze.getRemoteContext(paramContext);
      if (paramContext == null) {
        throw new zzg.zza("Could not get remote context.");
      }
      paramContext = paramContext.getClassLoader();
    }
    try
    {
      zzavJ = zzd((IBinder)paramContext.loadClass(zzavI).newInstance());
      return zzavJ;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new zzg.zza("Could not load creator class.", paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new zzg.zza("Could not instantiate creator.", paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new zzg.zza("Could not access creator.", paramContext);
    }
  }
  
  protected abstract Object zzd(IBinder paramIBinder);
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */