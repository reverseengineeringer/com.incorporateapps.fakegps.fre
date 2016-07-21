package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.internal.zzmw;

public abstract class GamesDowngradeableSafeParcel
  extends DowngradeableSafeParcel
{
  protected static boolean zzd(Integer paramInteger)
  {
    if (paramInteger == null) {
      return false;
    }
    return zzmw.zzcn(paramInteger.intValue());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesDowngradeableSafeParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */