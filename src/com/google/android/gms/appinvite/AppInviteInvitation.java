package com.google.android.gms.appinvite;

import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class AppInviteInvitation
{
  private static final String[] zzUK = { "jpg", "jpeg", "png" };
  
  public static String[] getInvitationIds(int paramInt, Intent paramIntent)
  {
    if (paramInt == -1) {
      return paramIntent.getStringArrayExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS");
    }
    return null;
  }
  
  private static Bundle zzJ(Map paramMap)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localBundle.putString(str, (String)paramMap.get(str));
    }
    return localBundle;
  }
  
  private static boolean zzbE(String paramString)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < zzUK.length)
      {
        if (zzUK[i].equals(paramString)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appinvite.AppInviteInvitation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */