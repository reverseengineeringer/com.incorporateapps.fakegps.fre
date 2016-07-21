package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzj();
  String description;
  private final int mVersionCode;
  String zzboL;
  String zzboM;
  int zzboN;
  String zzboh;
  String zzboi;
  
  LineItem()
  {
    mVersionCode = 1;
    zzboN = 0;
  }
  
  LineItem(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, String paramString5)
  {
    mVersionCode = paramInt1;
    description = paramString1;
    zzboL = paramString2;
    zzboM = paramString3;
    zzboh = paramString4;
    zzboN = paramInt2;
    zzboi = paramString5;
  }
  
  public static LineItem.Builder newBuilder()
  {
    LineItem localLineItem = new LineItem();
    localLineItem.getClass();
    return new LineItem.Builder(localLineItem, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getCurrencyCode()
  {
    return zzboi;
  }
  
  public final String getDescription()
  {
    return description;
  }
  
  public final String getQuantity()
  {
    return zzboL;
  }
  
  public final int getRole()
  {
    return zzboN;
  }
  
  public final String getTotalPrice()
  {
    return zzboh;
  }
  
  public final String getUnitPrice()
  {
    return zzboM;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.LineItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */