package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.zzlf.zza;

class SignInHubActivity$1
  implements zzlf.zza
{
  SignInHubActivity$1(SignInHubActivity paramSignInHubActivity, String paramString) {}
  
  public void zzk(Intent paramIntent)
  {
    if (paramIntent != null)
    {
      if (!TextUtils.isEmpty(zzXY)) {
        paramIntent.putExtra("scopes", zzXY);
      }
      SignInHubActivity.zza(zzXZ, paramIntent);
      return;
    }
    Log.w("AuthSignInClient", "Idp signin failed!");
    SignInHubActivity.zza(zzXZ, 4);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.SignInHubActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */