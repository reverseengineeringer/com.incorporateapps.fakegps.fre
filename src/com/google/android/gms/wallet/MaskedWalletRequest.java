package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class MaskedWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzm();
  private final int mVersionCode;
  String zzboi;
  String zzbop;
  Cart zzboz;
  boolean zzbpl;
  boolean zzbpm;
  boolean zzbpn;
  String zzbpo;
  String zzbpp;
  boolean zzbpq;
  boolean zzbpr;
  CountrySpecification[] zzbps;
  boolean zzbpt;
  boolean zzbpu;
  ArrayList zzbpv;
  PaymentMethodTokenizationParameters zzbpw;
  ArrayList zzbpx;
  
  MaskedWalletRequest()
  {
    mVersionCode = 3;
    zzbpt = true;
    zzbpu = true;
  }
  
  MaskedWalletRequest(int paramInt, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, String paramString3, String paramString4, Cart paramCart, boolean paramBoolean4, boolean paramBoolean5, CountrySpecification[] paramArrayOfCountrySpecification, boolean paramBoolean6, boolean paramBoolean7, ArrayList paramArrayList1, PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters, ArrayList paramArrayList2)
  {
    mVersionCode = paramInt;
    zzbop = paramString1;
    zzbpl = paramBoolean1;
    zzbpm = paramBoolean2;
    zzbpn = paramBoolean3;
    zzbpo = paramString2;
    zzboi = paramString3;
    zzbpp = paramString4;
    zzboz = paramCart;
    zzbpq = paramBoolean4;
    zzbpr = paramBoolean5;
    zzbps = paramArrayOfCountrySpecification;
    zzbpt = paramBoolean6;
    zzbpu = paramBoolean7;
    zzbpv = paramArrayList1;
    zzbpw = paramPaymentMethodTokenizationParameters;
    zzbpx = paramArrayList2;
  }
  
  public static MaskedWalletRequest.Builder newBuilder()
  {
    MaskedWalletRequest localMaskedWalletRequest = new MaskedWalletRequest();
    localMaskedWalletRequest.getClass();
    return new MaskedWalletRequest.Builder(localMaskedWalletRequest, null);
  }
  
  public final boolean allowDebitCard()
  {
    return zzbpu;
  }
  
  public final boolean allowPrepaidCard()
  {
    return zzbpt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final ArrayList getAllowedCardNetworks()
  {
    return zzbpx;
  }
  
  public final ArrayList getAllowedCountrySpecificationsForShipping()
  {
    return zzbpv;
  }
  
  public final CountrySpecification[] getAllowedShippingCountrySpecifications()
  {
    return zzbps;
  }
  
  public final Cart getCart()
  {
    return zzboz;
  }
  
  public final String getCurrencyCode()
  {
    return zzboi;
  }
  
  public final String getEstimatedTotalPrice()
  {
    return zzbpo;
  }
  
  public final String getMerchantName()
  {
    return zzbpp;
  }
  
  public final String getMerchantTransactionId()
  {
    return zzbop;
  }
  
  public final PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters()
  {
    return zzbpw;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final boolean isBillingAgreement()
  {
    return zzbpr;
  }
  
  public final boolean isPhoneNumberRequired()
  {
    return zzbpl;
  }
  
  public final boolean isShippingAddressRequired()
  {
    return zzbpm;
  }
  
  public final boolean useMinimalBillingAddress()
  {
    return zzbpn;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.MaskedWalletRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */