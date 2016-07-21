package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import java.util.ArrayList;

public final class AppContentSectionBuffer
  extends zzf
{
  private final ArrayList zzaDN;
  
  public final void release()
  {
    super.release();
    int j = zzaDN.size();
    int i = 1;
    while (i < j)
    {
      DataHolder localDataHolder = (DataHolder)zzaDN.get(i);
      if (localDataHolder != null) {
        localDataHolder.close();
      }
      i += 1;
    }
  }
  
  protected final AppContentSection zzo(int paramInt1, int paramInt2)
  {
    return new AppContentSectionRef(zzaDN, paramInt1, paramInt2);
  }
  
  protected final String zzqg()
  {
    return "section_id";
  }
  
  protected final String zzqi()
  {
    return "card_id";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentSectionBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */