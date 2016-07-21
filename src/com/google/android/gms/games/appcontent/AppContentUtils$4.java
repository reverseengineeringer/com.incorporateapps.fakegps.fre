package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

final class AppContentUtils$4
  implements AppContentUtils.AppContentRunner
{
  AppContentUtils$4(DataHolder paramDataHolder, Bundle paramBundle) {}
  
  public final void zzb(ArrayList paramArrayList, int paramInt)
  {
    paramArrayList = new AppContentTupleRef(zzaDS, paramInt);
    zzaDT.putString(paramArrayList.getName(), paramArrayList.getValue());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentUtils.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */