package com.google.android.gms.identity.intents;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;

public final class Address
{
  public static final Api API = new Api("Address.API", zzUJ, zzUI);
  static final Api.zzc zzUI = new Api.zzc();
  private static final Api.zza zzUJ = new Address.1();
  
  public static void requestUserAddress(GoogleApiClient paramGoogleApiClient, UserAddressRequest paramUserAddressRequest, int paramInt)
  {
    paramGoogleApiClient.zza(new Address.2(paramGoogleApiClient, paramUserAddressRequest, paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.identity.intents.Address
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */