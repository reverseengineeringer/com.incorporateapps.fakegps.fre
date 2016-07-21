package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Arrays;

public class PlusSession
  implements SafeParcelable
{
  public static final zzh CREATOR = new zzh();
  private final int mVersionCode;
  private final String zzVa;
  private final String zzada;
  private final String[] zzber;
  private final String[] zzbes;
  private final String[] zzbet;
  private final String zzbeu;
  private final String zzbev;
  private final String zzbew;
  private final PlusCommonExtras zzbex;
  
  PlusSession(int paramInt, String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, String paramString5, PlusCommonExtras paramPlusCommonExtras)
  {
    mVersionCode = paramInt;
    zzVa = paramString1;
    zzber = paramArrayOfString1;
    zzbes = paramArrayOfString2;
    zzbet = paramArrayOfString3;
    zzbeu = paramString2;
    zzbev = paramString3;
    zzada = paramString4;
    zzbew = paramString5;
    zzbex = paramPlusCommonExtras;
  }
  
  public PlusSession(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, PlusCommonExtras paramPlusCommonExtras)
  {
    mVersionCode = 1;
    zzVa = paramString1;
    zzber = paramArrayOfString1;
    zzbes = paramArrayOfString2;
    zzbet = paramArrayOfString3;
    zzbeu = paramString2;
    zzbev = paramString3;
    zzada = paramString4;
    zzbew = null;
    zzbex = paramPlusCommonExtras;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlusSession)) {}
    do
    {
      return false;
      paramObject = (PlusSession)paramObject;
    } while ((mVersionCode != mVersionCode) || (!zzw.equal(zzVa, zzVa)) || (!Arrays.equals(zzber, zzber)) || (!Arrays.equals(zzbes, zzbes)) || (!Arrays.equals(zzbet, zzbet)) || (!zzw.equal(zzbeu, zzbeu)) || (!zzw.equal(zzbev, zzbev)) || (!zzw.equal(zzada, zzada)) || (!zzw.equal(zzbew, zzbew)) || (!zzw.equal(zzbex, zzbex)));
    return true;
  }
  
  public String getAccountName()
  {
    return zzVa;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(mVersionCode), zzVa, zzber, zzbes, zzbet, zzbeu, zzbev, zzada, zzbew, zzbex });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("versionCode", Integer.valueOf(mVersionCode)).zzg("accountName", zzVa).zzg("requestedScopes", zzber).zzg("visibleActivities", zzbes).zzg("requiredFeatures", zzbet).zzg("packageNameForAuth", zzbeu).zzg("callingPackageName", zzbev).zzg("applicationName", zzada).zzg("extra", zzbex.toString()).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public String[] zzFd()
  {
    return zzber;
  }
  
  public String[] zzFe()
  {
    return zzbes;
  }
  
  public String[] zzFf()
  {
    return zzbet;
  }
  
  public String zzFg()
  {
    return zzbeu;
  }
  
  public String zzFh()
  {
    return zzbev;
  }
  
  public String zzFi()
  {
    return zzbew;
  }
  
  public PlusCommonExtras zzFj()
  {
    return zzbex;
  }
  
  public Bundle zzFk()
  {
    Bundle localBundle = new Bundle();
    localBundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
    zzbex.zzJ(localBundle);
    return localBundle;
  }
  
  public String zznX()
  {
    return zzada;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.PlusSession
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */