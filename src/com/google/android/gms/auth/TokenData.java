package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public class TokenData
  implements SafeParcelable
{
  public static final zze CREATOR = new zze();
  final int mVersionCode;
  private final String zzVo;
  private final Long zzVp;
  private final boolean zzVq;
  private final boolean zzVr;
  private final List zzVs;
  
  TokenData(int paramInt, String paramString, Long paramLong, boolean paramBoolean1, boolean paramBoolean2, List paramList)
  {
    mVersionCode = paramInt;
    zzVo = zzx.zzcM(paramString);
    zzVp = paramLong;
    zzVq = paramBoolean1;
    zzVr = paramBoolean2;
    zzVs = paramList;
  }
  
  public static TokenData zzc(Bundle paramBundle, String paramString)
  {
    paramBundle.setClassLoader(TokenData.class.getClassLoader());
    paramBundle = paramBundle.getBundle(paramString);
    if (paramBundle == null) {
      return null;
    }
    paramBundle.setClassLoader(TokenData.class.getClassLoader());
    return (TokenData)paramBundle.getParcelable("TokenData");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof TokenData)) {}
    do
    {
      return false;
      paramObject = (TokenData)paramObject;
    } while ((!TextUtils.equals(zzVo, zzVo)) || (!zzw.equal(zzVp, zzVp)) || (zzVq != zzVq) || (zzVr != zzVr) || (!zzw.equal(zzVs, zzVs)));
    return true;
  }
  
  public String getToken()
  {
    return zzVo;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzVo, zzVp, Boolean.valueOf(zzVq), Boolean.valueOf(zzVr), zzVs });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public Long zzmn()
  {
    return zzVp;
  }
  
  public boolean zzmo()
  {
    return zzVq;
  }
  
  public boolean zzmp()
  {
    return zzVr;
  }
  
  public List zzmq()
  {
    return zzVs;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.TokenData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */