package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public final class zzqz
  implements People
{
  public final Person getCurrentPerson(GoogleApiClient paramGoogleApiClient)
  {
    return Plus.zzf(paramGoogleApiClient, true).zzFa();
  }
  
  public final PendingResult load(GoogleApiClient paramGoogleApiClient, Collection paramCollection)
  {
    return paramGoogleApiClient.zza(new zzqz.4(this, paramGoogleApiClient, paramCollection));
  }
  
  public final PendingResult load(GoogleApiClient paramGoogleApiClient, String... paramVarArgs)
  {
    return paramGoogleApiClient.zza(new zzqz.5(this, paramGoogleApiClient, paramVarArgs));
  }
  
  public final PendingResult loadConnected(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzqz.3(this, paramGoogleApiClient));
  }
  
  public final PendingResult loadVisible(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString)
  {
    return paramGoogleApiClient.zza(new zzqz.1(this, paramGoogleApiClient, paramInt, paramString));
  }
  
  public final PendingResult loadVisible(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzqz.2(this, paramGoogleApiClient, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */