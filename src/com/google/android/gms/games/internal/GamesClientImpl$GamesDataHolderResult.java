package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzf;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesStatusCodes;

abstract class GamesClientImpl$GamesDataHolderResult
  extends zzf
{
  protected GamesClientImpl$GamesDataHolderResult(DataHolder paramDataHolder)
  {
    super(paramDataHolder, GamesStatusCodes.zzgc(paramDataHolder.getStatusCode()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.GamesDataHolderResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */