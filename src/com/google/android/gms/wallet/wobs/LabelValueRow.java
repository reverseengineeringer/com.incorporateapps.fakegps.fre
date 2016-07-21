package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmn;
import java.util.ArrayList;

public final class LabelValueRow
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  private final int mVersionCode;
  String zzbqF;
  String zzbqG;
  ArrayList zzbqH;
  
  LabelValueRow()
  {
    mVersionCode = 1;
    zzbqH = zzmn.zzsa();
  }
  
  LabelValueRow(int paramInt, String paramString1, String paramString2, ArrayList paramArrayList)
  {
    mVersionCode = paramInt;
    zzbqF = paramString1;
    zzbqG = paramString2;
    zzbqH = paramArrayList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.LabelValueRow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */