package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public class PlayLoggerContext
  implements SafeParcelable
{
  public static final zze CREATOR = new zze();
  public final String packageName;
  public final int versionCode;
  public final int zzbdL;
  public final int zzbdM;
  public final String zzbdN;
  public final String zzbdO;
  public final boolean zzbdP;
  public final String zzbdQ;
  public final boolean zzbdR;
  public final int zzbdS;
  
  public PlayLoggerContext(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, int paramInt4)
  {
    versionCode = paramInt1;
    packageName = paramString1;
    zzbdL = paramInt2;
    zzbdM = paramInt3;
    zzbdN = paramString2;
    zzbdO = paramString3;
    zzbdP = paramBoolean1;
    zzbdQ = paramString4;
    zzbdR = paramBoolean2;
    zzbdS = paramInt4;
  }
  
  public PlayLoggerContext(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt3)
  {
    versionCode = 1;
    packageName = ((String)zzx.zzz(paramString1));
    zzbdL = paramInt1;
    zzbdM = paramInt2;
    zzbdQ = paramString2;
    zzbdN = paramString3;
    zzbdO = paramString4;
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      zzbdP = bool;
      zzbdR = paramBoolean;
      zzbdS = paramInt3;
      return;
    }
  }
  
  public PlayLoggerContext(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, boolean paramBoolean)
  {
    versionCode = 1;
    packageName = ((String)zzx.zzz(paramString1));
    zzbdL = paramInt1;
    zzbdM = paramInt2;
    zzbdQ = null;
    zzbdN = paramString2;
    zzbdO = paramString3;
    zzbdP = paramBoolean;
    zzbdR = false;
    zzbdS = 0;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlayLoggerContext)) {
        break;
      }
      paramObject = (PlayLoggerContext)paramObject;
    } while ((versionCode == versionCode) && (packageName.equals(packageName)) && (zzbdL == zzbdL) && (zzbdM == zzbdM) && (zzw.equal(zzbdQ, zzbdQ)) && (zzw.equal(zzbdN, zzbdN)) && (zzw.equal(zzbdO, zzbdO)) && (zzbdP == zzbdP) && (zzbdR == zzbdR) && (zzbdS == zzbdS));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(versionCode), packageName, Integer.valueOf(zzbdL), Integer.valueOf(zzbdM), zzbdQ, zzbdN, zzbdO, Boolean.valueOf(zzbdP), Boolean.valueOf(zzbdR), Integer.valueOf(zzbdS) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlayLoggerContext[");
    localStringBuilder.append("versionCode=").append(versionCode).append(',');
    localStringBuilder.append("package=").append(packageName).append(',');
    localStringBuilder.append("packageVersionCode=").append(zzbdL).append(',');
    localStringBuilder.append("logSource=").append(zzbdM).append(',');
    localStringBuilder.append("logSourceName=").append(zzbdQ).append(',');
    localStringBuilder.append("uploadAccount=").append(zzbdN).append(',');
    localStringBuilder.append("loggingId=").append(zzbdO).append(',');
    localStringBuilder.append("logAndroidId=").append(zzbdP).append(',');
    localStringBuilder.append("isAnonymous=").append(zzbdR).append(',');
    localStringBuilder.append("qosTier=").append(zzbdS);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.playlog.internal.PlayLoggerContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */