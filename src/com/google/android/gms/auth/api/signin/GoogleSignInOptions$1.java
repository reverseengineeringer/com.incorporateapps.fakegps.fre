package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

final class GoogleSignInOptions$1
  implements Comparator
{
  public final int zza(Scope paramScope1, Scope paramScope2)
  {
    return paramScope1.zzpb().compareTo(paramScope2.zzpb());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInOptions.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */