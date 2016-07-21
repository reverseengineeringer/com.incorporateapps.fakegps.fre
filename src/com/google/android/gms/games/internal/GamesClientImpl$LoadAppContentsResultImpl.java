package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult;
import java.util.ArrayList;
import java.util.Arrays;

final class GamesClientImpl$LoadAppContentsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements AppContents.LoadAppContentResult
{
  private final ArrayList zzaEz;
  
  GamesClientImpl$LoadAppContentsResultImpl(DataHolder[] paramArrayOfDataHolder)
  {
    super(paramArrayOfDataHolder[0]);
    zzaEz = new ArrayList(Arrays.asList(paramArrayOfDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadAppContentsResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */