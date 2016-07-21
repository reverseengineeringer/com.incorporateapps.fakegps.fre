package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class zzq
  extends zzk
{
  public zzq(String paramString, int paramInt)
  {
    super(paramString, zzdg(paramString), Collections.emptyList(), paramInt);
  }
  
  private static String zzB(String paramString1, String paramString2)
  {
    return paramString1 + "." + paramString2;
  }
  
  private String zzdf(String paramString)
  {
    return zzB(getName(), paramString);
  }
  
  private static Collection zzdg(String paramString)
  {
    return Arrays.asList(new String[] { zzB(paramString, "permissionId"), zzB(paramString, "displayName"), zzB(paramString, "picture"), zzB(paramString, "isAuthenticatedUser"), zzB(paramString, "emailAddress") });
  }
  
  protected boolean zzb(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    return (paramDataHolder.zzcz(zzdf("permissionId"))) && (!paramDataHolder.zzi(zzdf("permissionId"), paramInt1, paramInt2));
  }
  
  protected UserMetadata zzj(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    String str1 = paramDataHolder.zzd(zzdf("permissionId"), paramInt1, paramInt2);
    if (str1 != null)
    {
      String str2 = paramDataHolder.zzd(zzdf("displayName"), paramInt1, paramInt2);
      String str3 = paramDataHolder.zzd(zzdf("picture"), paramInt1, paramInt2);
      boolean bool = paramDataHolder.zze(zzdf("isAuthenticatedUser"), paramInt1, paramInt2);
      paramDataHolder = paramDataHolder.zzd(zzdf("emailAddress"), paramInt1, paramInt2);
      return new UserMetadata(str1, str2, str3, Boolean.valueOf(bool).booleanValue(), paramDataHolder);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */