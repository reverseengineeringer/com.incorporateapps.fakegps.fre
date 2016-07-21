package com.google.android.gms.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public abstract interface People
{
  public abstract Person getCurrentPerson(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult load(GoogleApiClient paramGoogleApiClient, Collection paramCollection);
  
  public abstract PendingResult load(GoogleApiClient paramGoogleApiClient, String... paramVarArgs);
  
  public abstract PendingResult loadConnected(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult loadVisible(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString);
  
  public abstract PendingResult loadVisible(GoogleApiClient paramGoogleApiClient, String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.People
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */