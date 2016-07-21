package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RegisterSectionInfo
  implements SafeParcelable
{
  public static final zzi CREATOR = new zzi();
  final int mVersionCode;
  public final String name;
  public final int weight;
  public final String zzUd;
  public final boolean zzUe;
  public final boolean zzUf;
  public final String zzUg;
  public final Feature[] zzUh;
  final int[] zzUi;
  public final String zzUj;
  
  RegisterSectionInfo(int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString3, Feature[] paramArrayOfFeature, int[] paramArrayOfInt, String paramString4)
  {
    mVersionCode = paramInt1;
    name = paramString1;
    zzUd = paramString2;
    zzUe = paramBoolean1;
    weight = paramInt2;
    zzUf = paramBoolean2;
    zzUg = paramString3;
    zzUh = paramArrayOfFeature;
    zzUi = paramArrayOfInt;
    zzUj = paramString4;
  }
  
  RegisterSectionInfo(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, String paramString3, Feature[] paramArrayOfFeature, int[] paramArrayOfInt, String paramString4)
  {
    this(2, paramString1, paramString2, paramBoolean1, paramInt, paramBoolean2, paramString3, paramArrayOfFeature, paramArrayOfInt, paramString4);
  }
  
  public int describeContents()
  {
    zzi localzzi = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi localzzi = CREATOR;
    zzi.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.RegisterSectionInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */