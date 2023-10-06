class the_learning_game {
  constructor () {
    this._cmd = null;
    this._map = {};
  }

  command (cmd, num) {
    this._cmd = cmd;
    this._map[cmd] = this._map[cmd] || ACTIONS();
    return this._map[cmd][0](num);
  }

  response (resp) {
    resp || this._map[this._cmd].shift();
  }
}
