# Journal
Describe a scenario in a larger game where allowing outside code to directly change a Guardian’s defenseRating would cause severe bugs or cheating. How does direct field access limit your control as a developer?

In playing a multiplayer game where anyone can just reach into the code and directly change guardian.defenseRating. That opens the door to huge bugs and easy cheating. A player could max out their defense or push it way past the game's limits, totally breaking game balance. Worse yet, throwing crazy numbers into that field could mess up damage math so badly that it crashes the entire game server.

Direct field access prevents developers from enforcing input constraints and leads to fragile code. If you later change or rename an instance variable, you are forced to manually update every reference across the entire codebase.


_________

What broke in main when you set the fields private? What did you have to do to get it to work again, and why do you think this is the preferred practice?

The name and defenseRating fields directly caused compilation errors in the Main class once they were marked private. To resolve this, I updated the code to use the public getter and setter methods (getName(), setName(), getDefenseRating(), and setDefenseRating()). This approach is best practice because it enforces data integrity through validation, controls read and write access, and stops changes inside the class from breaking outside code. 