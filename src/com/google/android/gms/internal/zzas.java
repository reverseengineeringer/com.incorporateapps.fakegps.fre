package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract interface zzas
  extends IInterface
{
  public abstract Bundle zza(Account paramAccount);
  
  public abstract Bundle zza(Account paramAccount, String paramString, Bundle paramBundle);
  
  public abstract Bundle zza(Bundle paramBundle);
  
  public abstract Bundle zza(String paramString, Bundle paramBundle);
  
  public abstract Bundle zza(String paramString1, String paramString2, Bundle paramBundle);
  
  public abstract AccountChangeEventsResponse zza(AccountChangeEventsRequest paramAccountChangeEventsRequest);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzas
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */