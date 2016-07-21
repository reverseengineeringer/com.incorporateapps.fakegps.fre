package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.Locale;

public class zzl
{
  private static boolean zzaed = false;
  protected final String mTag;
  private final boolean zzaee;
  private boolean zzaef;
  private boolean zzaeg;
  private String zzaeh;
  
  public zzl(String paramString)
  {
    this(paramString, zzox());
  }
  
  public zzl(String paramString, boolean paramBoolean)
  {
    zzx.zzh(paramString, "The log tag cannot be null or empty.");
    mTag = paramString;
    if (paramString.length() <= 23) {}
    for (boolean bool = true;; bool = false)
    {
      zzaee = bool;
      zzaef = paramBoolean;
      zzaeg = false;
      return;
    }
  }
  
  public static boolean zzox()
  {
    return zzaed;
  }
  
  public void zzY(boolean paramBoolean)
  {
    zzaef = paramBoolean;
  }
  
  public void zza(String paramString, Object... paramVarArgs)
  {
    if (zzow()) {
      Log.v(mTag, zzg(paramString, paramVarArgs));
    }
  }
  
  public void zzb(String paramString, Object... paramVarArgs)
  {
    if ((zzov()) || (zzaed)) {
      Log.d(mTag, zzg(paramString, paramVarArgs));
    }
  }
  
  public void zzb(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    if ((zzov()) || (zzaed)) {
      Log.d(mTag, zzg(paramString, paramVarArgs), paramThrowable);
    }
  }
  
  public void zzc(String paramString, Object... paramVarArgs)
  {
    Log.e(mTag, zzg(paramString, paramVarArgs));
  }
  
  public void zzc(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    Log.w(mTag, zzg(paramString, paramVarArgs), paramThrowable);
  }
  
  public void zzcn(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (paramString = null;; paramString = String.format("[%s] ", new Object[] { paramString }))
    {
      zzaeh = paramString;
      return;
    }
  }
  
  public void zze(String paramString, Object... paramVarArgs)
  {
    Log.i(mTag, zzg(paramString, paramVarArgs));
  }
  
  public void zzf(String paramString, Object... paramVarArgs)
  {
    Log.w(mTag, zzg(paramString, paramVarArgs));
  }
  
  protected String zzg(String paramString, Object... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {}
    for (;;)
    {
      paramVarArgs = paramString;
      if (!TextUtils.isEmpty(zzaeh)) {
        paramVarArgs = zzaeh + paramString;
      }
      return paramVarArgs;
      paramString = String.format(Locale.ROOT, paramString, paramVarArgs);
    }
  }
  
  public boolean zzov()
  {
    return (zzaef) || ((zzaee) && (Log.isLoggable(mTag, 3)));
  }
  
  public boolean zzow()
  {
    return zzaeg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */