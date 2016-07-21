package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

public class zznr
{
  public static boolean zza(List paramList1, List paramList2)
  {
    if (paramList1.size() != paramList2.size()) {
      return false;
    }
    paramList1 = paramList1.iterator();
    while (paramList1.hasNext()) {
      if (!paramList2.contains(paramList1.next())) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zznr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */