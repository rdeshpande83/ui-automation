/*
 * Copyright 2018 inpwtepydjuf@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mmarquee.demo

import mmarquee.automation.controls.AutomationWindow

class PacketLoggerApplication extends BaseApplication {
  private var window: AutomationWindow = _

  applicationTitle = "C:\\Users\\inpwt\\Downloads\\windump.exe"
//  def applicationArgumentsList = "-p",  "-nn",  "-N",  "-w capture.dump",  "-X", "-s 0", "-i 1", "host 192.168.1.1"
//  def dumpArguments = "-r capture.dump -nnvvvSeXX > dump.out"

  def launch(): Unit = {
    application = automation.launchWithDirectory(applicationTitle,
      "-p",  "-nn",  "-N",  "-w capture.dump",  "-X", "-s 0", "-i 1", "host 192.168.1.1")

    // A short wait for the expand to work, just in case
    Thread.sleep(500)

    // Find the window
//    window = automation.getDesktopWindow(applicationTitle)
  }

  def dump(): Unit = {
    automation.launch(applicationTitle, "-r capture.dump", "-nnvvvSeXX")
  }

  override def exit(): Unit = {
    application.end()
  }
}

// start - C:\Users\inpwt\Downloads\windump.exe -p -nn -N -w capture.txt -X -s 0 -i 1 host XX.XX.XX.XX
// dump - \".\\windump\" -r capture.txt -nnvvvSeXX > dump.out"
// stop - just stop process?
