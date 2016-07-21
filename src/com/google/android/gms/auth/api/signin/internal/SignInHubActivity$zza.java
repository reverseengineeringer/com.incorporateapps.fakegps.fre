package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import com.google.android.gms.common.api.GoogleApiClient;

class SignInHubActivity$zza
  implements LoaderManager.LoaderCallbacks
{
  private SignInHubActivity$zza(SignInHubActivity paramSignInHubActivity) {}
  
  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return new zzb(zzXZ, GoogleApiClient.zzoV());
  }
  
  public void onLoaderReset(Loader paramLoader) {}
  
  public void zza(Loader paramLoader, Void paramVoid)
  {
    zzXZ.setResult(SignInHubActivity.zza(zzXZ), SignInHubActivity.zzb(zzXZ));
    zzXZ.finish();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */