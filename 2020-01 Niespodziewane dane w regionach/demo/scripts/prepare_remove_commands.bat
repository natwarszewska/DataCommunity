echo off
FOR /F %%i IN (keys.txt) DO echo remove --region=/CUSTOMERS --key=%%i >> keys_with_remove_cmd.gfsh