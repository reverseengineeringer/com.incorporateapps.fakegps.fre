package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzr();
  private final int mVersionCode;
  String zzbpF;
  String zzbpG;
  int zzbpH;
  int zzbpI;
  
  ProxyCard(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzbpF = paramString1;
    zzbpG = paramString2;
    zzbpH = paramInt2;
    zzbpI = paramInt3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getCvn()
  {
    return zzbpG;
  }
  
  public final int getExpirationMonth()
  {
    return zzbpH;
  }
  
  public final int getExpirationYear()
  {
    return zzbpI;
  }
  
  public final String getPan()
  {
    return zzbpF;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.ProxyCard
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */