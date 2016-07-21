package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.internal.zzro;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzf
{
  private final Account zzTI;
  private final String zzUW;
  private final Set zzagh;
  private final int zzagj;
  private final View zzagk;
  private final String zzagl;
  private final Set zzalb;
  private final Map zzalc;
  private final zzro zzald;
  private Integer zzale;
  
  public zzf(Account paramAccount, Set paramSet, Map paramMap, int paramInt, View paramView, String paramString1, String paramString2, zzro paramzzro)
  {
    zzTI = paramAccount;
    if (paramSet == null) {}
    for (paramAccount = Collections.EMPTY_SET;; paramAccount = Collections.unmodifiableSet(paramSet))
    {
      zzagh = paramAccount;
      paramAccount = paramMap;
      if (paramMap == null) {
        paramAccount = Collections.EMPTY_MAP;
      }
      zzalc = paramAccount;
      zzagk = paramView;
      zzagj = paramInt;
      zzUW = paramString1;
      zzagl = paramString2;
      zzald = paramzzro;
      paramAccount = new HashSet(zzagh);
      paramSet = zzalc.values().iterator();
      while (paramSet.hasNext()) {
        paramAccount.addAll(nextzzXf);
      }
    }
    zzalb = Collections.unmodifiableSet(paramAccount);
  }
  
  public static zzf zzat(Context paramContext)
  {
    return new GoogleApiClient.Builder(paramContext).zzoY();
  }
  
  public final Account getAccount()
  {
    return zzTI;
  }
  
  public final String getAccountName()
  {
    if (zzTI != null) {
      return zzTI.name;
    }
    return null;
  }
  
  public final void zza(Integer paramInteger)
  {
    zzale = paramInteger;
  }
  
  public final Set zzb(Api paramApi)
  {
    paramApi = (zzf.zza)zzalc.get(paramApi);
    if ((paramApi == null) || (zzXf.isEmpty())) {
      return zzagh;
    }
    HashSet localHashSet = new HashSet(zzagh);
    localHashSet.addAll(zzXf);
    return localHashSet;
  }
  
  public final Account zzqq()
  {
    if (zzTI != null) {
      return zzTI;
    }
    return new Account("<<default account>>", "com.google");
  }
  
  public final int zzqr()
  {
    return zzagj;
  }
  
  public final Set zzqs()
  {
    return zzagh;
  }
  
  public final Set zzqt()
  {
    return zzalb;
  }
  
  public final Map zzqu()
  {
    return zzalc;
  }
  
  public final String zzqv()
  {
    return zzUW;
  }
  
  public final String zzqw()
  {
    return zzagl;
  }
  
  public final View zzqx()
  {
    return zzagk;
  }
  
  public final zzro zzqy()
  {
    return zzald;
  }
  
  public final Integer zzqz()
  {
    return zzale;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */