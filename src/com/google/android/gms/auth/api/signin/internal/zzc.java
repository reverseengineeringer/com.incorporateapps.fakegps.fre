package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class zzc
  implements GoogleSignInApi
{
  private OptionalPendingResult zza(GoogleApiClient paramGoogleApiClient, GoogleSignInOptions paramGoogleSignInOptions)
  {
    Log.d("GoogleSignInApiImpl", "trySilentSignIn");
    return new zzr(paramGoogleApiClient.zza(new zzc.1(this, paramGoogleApiClient, paramGoogleSignInOptions)));
  }
  
  private boolean zza(Account paramAccount1, Account paramAccount2)
  {
    if (paramAccount1 == null) {
      return paramAccount2 == null;
    }
    return paramAccount1.equals(paramAccount2);
  }
  
  private GoogleSignInOptions zzb(GoogleApiClient paramGoogleApiClient)
  {
    return ((zzd)paramGoogleApiClient.zza(Auth.zzVx)).zznd();
  }
  
  public Intent getSignInIntent(GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzz(paramGoogleApiClient);
    return ((zzd)paramGoogleApiClient.zza(Auth.zzVx)).zznc();
  }
  
  public GoogleSignInResult getSignInResultFromIntent(Intent paramIntent)
  {
    if ((paramIntent == null) || ((!paramIntent.hasExtra("googleSignInStatus")) && (!paramIntent.hasExtra("googleSignInAccount")))) {
      return null;
    }
    GoogleSignInAccount localGoogleSignInAccount = (GoogleSignInAccount)paramIntent.getParcelableExtra("googleSignInAccount");
    paramIntent = (Status)paramIntent.getParcelableExtra("googleSignInStatus");
    if (localGoogleSignInAccount != null) {
      paramIntent = Status.zzagC;
    }
    return new GoogleSignInResult(localGoogleSignInAccount, paramIntent);
  }
  
  public PendingResult revokeAccess(GoogleApiClient paramGoogleApiClient)
  {
    zzq.zzaf(paramGoogleApiClient.getContext()).zznr();
    Iterator localIterator = GoogleApiClient.zzoV().iterator();
    while (localIterator.hasNext()) {
      ((GoogleApiClient)localIterator.next()).zzoW();
    }
    return paramGoogleApiClient.zzb(new zzc.3(this, paramGoogleApiClient));
  }
  
  public PendingResult signOut(GoogleApiClient paramGoogleApiClient)
  {
    zzq.zzaf(paramGoogleApiClient.getContext()).zznr();
    Iterator localIterator = GoogleApiClient.zzoV().iterator();
    while (localIterator.hasNext()) {
      ((GoogleApiClient)localIterator.next()).zzoW();
    }
    return paramGoogleApiClient.zzb(new zzc.2(this, paramGoogleApiClient));
  }
  
  public OptionalPendingResult silentSignIn(GoogleApiClient paramGoogleApiClient)
  {
    GoogleSignInOptions localGoogleSignInOptions = zzb(paramGoogleApiClient);
    GoogleSignInResult localGoogleSignInResult = zza(paramGoogleApiClient.getContext(), localGoogleSignInOptions);
    if (localGoogleSignInResult != null) {
      return PendingResults.zzb(localGoogleSignInResult, paramGoogleApiClient);
    }
    return zza(paramGoogleApiClient, localGoogleSignInOptions);
  }
  
  public GoogleSignInResult zza(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    Log.d("GoogleSignInApiImpl", "getSavedSignInResultIfEligible");
    zzx.zzz(paramGoogleSignInOptions);
    paramContext = zzq.zzaf(paramContext);
    GoogleSignInOptions localGoogleSignInOptions = paramContext.zznp();
    if (localGoogleSignInOptions == null) {}
    do
    {
      do
      {
        return null;
      } while ((!zza(localGoogleSignInOptions.getAccount(), paramGoogleSignInOptions.getAccount())) || (paramGoogleSignInOptions.zzmP()) || ((paramGoogleSignInOptions.zzmO()) && ((!localGoogleSignInOptions.zzmO()) || (!paramGoogleSignInOptions.zzmR().equals(localGoogleSignInOptions.zzmR())))) || (!new HashSet(localGoogleSignInOptions.zzmN()).containsAll(new HashSet(paramGoogleSignInOptions.zzmN()))));
      paramContext = paramContext.zzno();
    } while ((paramContext == null) || (paramContext.zzb()));
    return new GoogleSignInResult(paramContext, Status.zzagC);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */