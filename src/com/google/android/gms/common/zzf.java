package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;

public class zzf
{
  private static final zzf zzafS = new zzf();
  
  public static zzf zzoO()
  {
    return zzafS;
  }
  
  zzd.zza zza(PackageInfo paramPackageInfo, zzd.zza... paramVarArgs)
  {
    if (signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    }
    paramPackageInfo = new zzd.zzb(signatures[0].toByteArray());
    int i = 0;
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals(paramPackageInfo)) {
        return paramVarArgs[i];
      }
      i += 1;
    }
    if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
      Log.v("GoogleSignatureVerifier", "Signature not valid.  Found: \n" + Base64.encodeToString(paramPackageInfo.getBytes(), 0));
    }
    return null;
  }
  
  public boolean zza(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if ((paramPackageInfo != null) && (signatures != null))
    {
      if (paramBoolean) {}
      for (paramPackageInfo = zza(paramPackageInfo, zzd.zzd.zzafK); paramPackageInfo != null; paramPackageInfo = zza(paramPackageInfo, new zzd.zza[] { zzd.zzd.zzafK[0] })) {
        return true;
      }
    }
    return false;
  }
  
  public boolean zza(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    boolean bool1 = false;
    if (paramPackageInfo == null) {}
    boolean bool2;
    do
    {
      do
      {
        return bool1;
        if (zze.zzc(paramPackageManager)) {
          return zza(paramPackageInfo, true);
        }
        bool2 = zza(paramPackageInfo, false);
        bool1 = bool2;
      } while (bool2);
      bool1 = bool2;
    } while (!zza(paramPackageInfo, true));
    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    return bool2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */