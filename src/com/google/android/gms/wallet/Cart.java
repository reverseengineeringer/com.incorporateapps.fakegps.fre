package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class Cart
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final int mVersionCode;
  String zzboh;
  String zzboi;
  ArrayList zzboj;
  
  Cart()
  {
    mVersionCode = 1;
    zzboj = new ArrayList();
  }
  
  Cart(int paramInt, String paramString1, String paramString2, ArrayList paramArrayList)
  {
    mVersionCode = paramInt;
    zzboh = paramString1;
    zzboi = paramString2;
    zzboj = paramArrayList;
  }
  
  public static Cart.Builder newBuilder()
  {
    Cart localCart = new Cart();
    localCart.getClass();
    return new Cart.Builder(localCart, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getCurrencyCode()
  {
    return zzboi;
  }
  
  public final ArrayList getLineItems()
  {
    return zzboj;
  }
  
  public final String getTotalPrice()
  {
    return zzboh;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.Cart
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */