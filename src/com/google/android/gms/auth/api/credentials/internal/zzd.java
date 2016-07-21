package com.google.android.gms.auth.api.credentials.internal;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;

public final class zzd
  implements CredentialsApi
{
  private PasswordSpecification zza(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = ((zzf)paramGoogleApiClient.zza(Auth.zzVu)).zzmD();
    if ((paramGoogleApiClient != null) && (paramGoogleApiClient.zzmr() != null)) {
      return paramGoogleApiClient.zzmr();
    }
    return PasswordSpecification.zzWl;
  }
  
  public final PendingResult delete(GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    return paramGoogleApiClient.zzb(new zzd.3(this, paramGoogleApiClient, paramCredential));
  }
  
  public final PendingResult disableAutoSignIn(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new zzd.4(this, paramGoogleApiClient));
  }
  
  public final PendingIntent getHintPickerIntent(GoogleApiClient paramGoogleApiClient, HintRequest paramHintRequest)
  {
    zzx.zzb(paramGoogleApiClient, "client must not be null");
    zzx.zzb(paramHintRequest, "request must not be null");
    zzx.zzb(paramGoogleApiClient.zza(Auth.CREDENTIALS_API), "Auth.CREDENTIALS_API must be added to GoogleApiClient to use this API");
    paramHintRequest = zzb.zza(paramGoogleApiClient.getContext(), paramHintRequest, zza(paramGoogleApiClient));
    return PendingIntent.getActivity(paramGoogleApiClient.getContext(), 2000, paramHintRequest, 268435456);
  }
  
  public final PendingResult request(GoogleApiClient paramGoogleApiClient, CredentialRequest paramCredentialRequest)
  {
    return paramGoogleApiClient.zza(new zzd.1(this, paramGoogleApiClient, paramCredentialRequest));
  }
  
  public final PendingResult save(GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    return paramGoogleApiClient.zzb(new zzd.2(this, paramGoogleApiClient, paramCredential));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */